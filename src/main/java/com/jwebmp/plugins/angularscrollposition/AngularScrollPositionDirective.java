package com.jwebmp.plugins.angularscrollposition;

import com.jwebmp.FileTemplates;
import com.jwebmp.base.angular.directives.AngularDirectiveBase;

/**
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularScrollPositionDirective
		extends AngularDirectiveBase
{

	private static final long serialVersionUID = 1L;

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
}
