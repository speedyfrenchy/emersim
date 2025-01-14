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

package jmt.gui.jwat;

import java.text.DecimalFormat;

public class DinamicFormat {
	public DinamicFormat(String pattern, int limit) {
		formato = new DecimalFormat(pattern);
		maxValVis = limit;
	}

	public String format(double Val) {
		String ret = String.valueOf(Val);

		if (ret.length() > maxValVis) {
			ret = formato.format(Val);
		}

		return ret;
	}

	public String format(long Val) {
		String ret = String.valueOf(Val);

		if (ret.length() > maxValVis) {
			ret = formato.format(Val);
		}

		return ret;
	}

	public void setLimit(int limit) {
		maxValVis = limit;
	}

	private int maxValVis;
	private DecimalFormat formato;
}