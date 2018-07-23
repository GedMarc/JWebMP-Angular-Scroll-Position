import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularscrollposition.AngularScrollPositionDirective;
import com.jwebmp.plugins.angularscrollposition.AngularScrollPositionPageConfigurator;

module com.jwebmp.plugins.angularscrollposition {
	exports com.jwebmp.plugins.angularscrollposition;

	requires com.jwebmp.core;

	provides IPageConfigurator with AngularScrollPositionPageConfigurator;
	provides IAngularDirective with AngularScrollPositionDirective;

}
