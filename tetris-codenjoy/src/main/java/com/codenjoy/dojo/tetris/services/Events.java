package com.codenjoy.dojo.tetris.services;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2016 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

public class Events {

    public static final String GLASS_OVERFLOWN = "glassOverflown";
    public static final String LINES_REMOVED = "linesRemoved";
    public static final String FIGURES_DROPPED = "figuresDropped";

    private String type;
    private int data;

    public Events(String type, int data) {
        this.type = type;
        this.data = data;
    }

    public boolean isGlassOverflown() {
        return type.equals(GLASS_OVERFLOWN);
    }

    public boolean isLinesRemoved() {
        return type.equals(LINES_REMOVED);
    }

    public boolean isFiguresDropped() {
        return type.equals(FIGURES_DROPPED);
    }

    public static Events glassOverflown() {
        return new Events(GLASS_OVERFLOWN, 0);
    }

    public static Events linesRemoved(int removedLines) {
        return new Events(LINES_REMOVED, removedLines);
    }

    public static Events figuresDropped(int figureIndex) {
        return new Events(FIGURES_DROPPED, figureIndex);
    }

    public int getData() {
        return data;
    }
}
