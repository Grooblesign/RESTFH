import play.*;
import play.api.mvc.EssentialFilter;

import filters.AddResponseHeader;

public class Global extends GlobalSettings {
	@Override
	public void onStart(Application app) {
		Logger.info("Application has started");
	}  
  
	@Override
	public void onStop(Application app) {
		Logger.info("Application shutdown...");
	}
		
	// @Override
	// public <T extends EssentialFilter> Class<T>[] filters() {
	// 	return new Class[] {AddResponseHeader.class};
	// }		
}