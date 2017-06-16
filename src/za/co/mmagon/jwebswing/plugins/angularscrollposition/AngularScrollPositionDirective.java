package za.co.mmagon.jwebswing.plugins.angularscrollposition;

import za.co.mmagon.FileTemplates;
import za.co.mmagon.jwebswing.base.angular.directives.AngularDirectiveBase;

/**
 *
 * @author Marc Magon
 * @since 30 May 2017
 */
public class AngularScrollPositionDirective extends AngularDirectiveBase
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
        return FileTemplates.getFileTemplate(AngularScrollPositionDirective.class, "scrollPosition.min").toString();
    }
}
