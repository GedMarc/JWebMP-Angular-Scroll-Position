package com.jwebmp.plugins.angularscrollposition.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularScrollPositionModuleInclusions implements IGuiceScanModuleInclusions<AngularScrollPositionModuleInclusions>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		//set.add("com.jwebmp.plugins.angularscrollposition");
		return set;
	}
}
