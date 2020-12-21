/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularscrollposition;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Allows for elements to have a zoom in animation by adding a class
 *
 * @author GedMarc
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Scroll Position",
		pluginDescription = "A simple scroll directive to track and change ng-repeat index/id on scroll. This works great with GoogleMaps or any other set of data you want to track with. It uses angular-scroll and angular.",
		pluginUniqueName = "angular-scroll-position",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,animation,zoom, ui,web ui, framework",
		pluginSubtitle = "A simple scroll directive to track and change ng-repeat index/id on scroll",
		pluginSourceUrl = "https://github.com/evanjmg/angular-track-scroll",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP/Angular-Scroll-Position/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP/Angular-Scroll-Position",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://angularscript.com/angular-directive-for-tracking-scroll-position/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.angular/jwebmp-angular-scroll-position",
		pluginGroupId = "com.jwebmp.plugins.angular",
		pluginArtifactId = "jwebmp-angular-scroll-position",
		pluginModuleName = "com.jwebmp.plugins.angularscrollposition",
		pluginStatus = PluginStatus.Released
)
@ComponentInformation(name = "Angular Scroll Position",
		description = "Places the position of the scroll bar into a client side variable for reading",
		url = "https://www.akveo.com/products.html")
public class AngularScrollPositionPageConfigurator
		implements IPageConfigurator<AngularScrollPositionPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularScrollPositionPageConfigurator
	 */
	public AngularScrollPositionPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularScrollPositionPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularScrollPositionPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		JQueryPageConfigurator.setRequired(true);
		AngularPageConfigurator.setRequired(true);
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularScrollPositionPageConfigurator.enabled;
	}
}
