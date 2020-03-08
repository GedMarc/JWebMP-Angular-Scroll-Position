module com.jwebmp.plugins.angularscrollposition {
	exports com.jwebmp.plugins.angularscrollposition;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularscrollposition.AngularScrollPositionPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularDirective with com.jwebmp.plugins.angularscrollposition.AngularScrollPositionDirective;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularscrollposition.implementations.AngularScrollPositionExclusionsModule;
}
