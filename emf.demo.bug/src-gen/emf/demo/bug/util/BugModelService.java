package emf.demo.bug.util;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class BugModelService {

	/**
	 * Computer and check if 
	 * 
	 * @param submitPath The relative path to the resource
	 * @return the complete path to the resource relative to workspace point of view, of elsePath if the resource is not found. 
	 * @throws ExpliciteException if the resource does not exist.
	 */
	public static String resourcePath(EObject eObj, String submitPath) throws Exception {
		String _result = null;
		
		if (! StringUtils.isBlank(submitPath)) {
			_result = submitPath;
			if (_result.startsWith("./")) {
				var _parts = new ArrayList<String>(Arrays.asList(eObj.eResource().getURI().toPlatformString(true).split("\\/", -1)));
				
				_parts.remove(_parts.size()-1);
				// removes './'
				_parts.add(_result.substring(2));
				
				_result = String.join("/", _parts);
				
			}
			
			var _targetUri = URI.createPlatformResourceURI(_result, true); 
			if(! eObj.eResource().getResourceSet().getURIConverter().exists(_targetUri, null)) {
				throw new Exception(String.format("The resource %s does not exist in the workspace", _targetUri));
			}
			
			// Please add platform://resource/... to have the platform uri
			_result = _targetUri.toPlatformString(true);
		}
		
		return _result;
	}
	
	
}
