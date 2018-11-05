import com.jwebmp.core.base.angular.services.IAngularDirective;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularscrollposition.AngularScrollPositionDirective;
import com.jwebmp.plugins.angularscrollposition.AngularScrollPositionPageConfigurator;
import com.jwebmp.plugins.angularscrollposition.implementations.AngularScrollPositionExclusionsModule;

module com.jwebmp.plugins.angularscrollposition {
	exports com.jwebmp.plugins.angularscrollposition;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularScrollPositionPageConfigurator;
	provides IAngularDirective with AngularScrollPositionDirective;

	provides IGuiceScanModuleExclusions with AngularScrollPositionExclusionsModule;
	provides IGuiceScanJarExclusions with AngularScrollPositionExclusionsModule;
}
