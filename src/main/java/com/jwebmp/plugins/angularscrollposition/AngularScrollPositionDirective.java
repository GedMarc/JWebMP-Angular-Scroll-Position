package com.jwebmp.plugins.angularscrollposition;

import com.jwebmp.core.FileTemplates;
import com.jwebmp.core.base.angular.directives.AngularDirectiveBase;
import com.jwebmp.core.base.angular.services.IAngularDirective;

/**
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularScrollPositionDirective
		extends AngularDirectiveBase
		implements IAngularDirective<AngularScrollPositionDirective>
{


	/*
	 * Constructs a new AngularScrollPositionDirective
	 */
	public AngularScrollPositionDirective()
	{
		super("AngularScrollPositionDirective");
	}

	@Override
	public String renderFunction()
	{
		return FileTemplates.getFileTemplate(AngularScrollPositionDirective.class, "scrollPosition", "scrollPosition.min.js")
		                    .toString();
	}

	/**
	 * If this page configurator is enabled
	 *
	 * @return if the configuration must run
	 */
	@Override
	public boolean enabled()
	{
		return AngularScrollPositionPageConfigurator.isEnabled();
	}
}
