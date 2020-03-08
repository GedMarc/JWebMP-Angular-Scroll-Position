package com.jwebmp.plugins.angularscrollposition.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularScrollPositionExclusionsModule
		implements IGuiceScanModuleExclusions<AngularScrollPositionExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularscrollposition");
		return strings;
	}
}
