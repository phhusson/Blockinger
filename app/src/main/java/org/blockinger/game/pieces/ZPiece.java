/*
 * Copyright 2013 Simon Willeke
 * contact: hamstercount@hotmail.com
 */

/*
    This file is part of Blockinger.

    Blockinger is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Blockinger is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Blockinger.  If not, see <http://www.gnu.org/licenses/>.

 */

package org.blockinger.game.pieces;

import org.blockinger.game.Square;

import android.content.Context;

public class ZPiece extends Piece3x3 {

	private Square zSquare;

	public ZPiece(Context c) {
		super(c);
		zSquare = new Square(Piece.type_Z,c);
		pattern[1][0] = zSquare;
		pattern[1][1] = zSquare;
		pattern[2][1] = zSquare;
		pattern[2][2] = zSquare;
		reDraw();
	}

	@Override
	public void reset(Context c) {
		super.reset(c);
		pattern[1][0] = zSquare;
		pattern[1][1] = zSquare;
		pattern[2][1] = zSquare;
		pattern[2][2] = zSquare;
		reDraw();
	}

}
