/*
 * jGnash, a personal finance application
 * Copyright (C) 2001-2017 Craig Cavanaugh
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jgnash.engine;

import jgnash.util.ResourceUtils;

/**
 * Enumeration for the reconciled state of a transaction.
 *
 * @author Craig Cavanaugh
 */
public enum ReconciledState {
    CLEARED(ResourceUtils.getString("State.Cleared")),
    NOT_RECONCILED(ResourceUtils.getString("State.NotReconciled")),
    RECONCILED(ResourceUtils.getString("State.Reconciled"));

    private final transient String symbol;

    ReconciledState(final String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
