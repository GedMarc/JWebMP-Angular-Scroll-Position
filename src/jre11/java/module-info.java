module com.jwebmp.plugins.angularscrollposition {
	exports com.jwebmp.plugins.angularscrollposition;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularscrollposition.AngularScrollPositionPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularscrollposition.AngularScrollPositionDirective;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularscrollposition.implementations.AngularScrollPositionExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularscrollposition.implementations.AngularScrollPositionExclusionsModule;
}
