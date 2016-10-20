/**
 * Copyright (C) 2016, Laboratorio di Valutazione delle Prestazioni - Politecnico di Milano

 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 */

package jmt.gui.common.joinStrategies;

import jmt.gui.common.joinStrategies.JoinStrategy;

public class PartialJoin extends JoinStrategy {

	private int requiredNum = 1;

	public PartialJoin() {
		description = "Fires the join upon arrival of a subset of forked tasks. "
				+ "Exceeding tasks will be ignored at this station.";
	}

	@Override
	public String getName() {
		return "Quorum";
	}

	@Override
	public int getRequiredNum() {
		return this.requiredNum;
	}

	@Override
	public void setRequiredNum(int i) {
		this.requiredNum = i;
	}

	@Override
	public JoinStrategy clone() {
		PartialJoin ps = new PartialJoin();
		ps.requiredNum = this.requiredNum;
		return ps;
	}

	@Override
	public String getClassPath() {
		return "jmt.engine.NetStrategies.JoinStrategies.PartialJoin";
	}

	@Override
	public boolean isModelStateDependent() {
		return false;
	}

}
