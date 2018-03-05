package za.co.mmagon.jwebswing.plugins.angularscrollposition;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Allows for elements to have a zoom in animation by adding a class
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Scroll Position",
		pluginDescription = "Allows to set the scroll position via angular",
		pluginUniqueName = "jwebswing-angular-scroll-position",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,animation,zoom, ui,web ui, framework",
		pluginSubtitle = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any " +
				                 "element.",
		pluginSourceUrl = "https://www.akveo.com/products.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing/Angular-Scroll-Position/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing/Angular-Scroll-Position",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.akveo.com/products.html",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularZoomInAnimation.jar/download")
@ComponentInformation(name = "Angular Zoom In",
		description = "Allows for almost anything to have the zoom in effect attached by simply adding the zoomin class to any element.",
		url = "https://www.akveo.com/products.html")
public class AngularScrollPositionPageConfigurator
		extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularScrollPositionPageConfigurator
	 */
	public AngularScrollPositionPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
		}
		return page;
	}
}
