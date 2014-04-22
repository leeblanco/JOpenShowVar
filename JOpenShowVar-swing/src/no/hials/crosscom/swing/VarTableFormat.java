/*
 * Copyright (c) 2014, Aalesund University College
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package no.hials.crosscom.swing;

import ca.odell.glazedlists.gui.TableFormat;
import no.hials.crosscom.variables.Variable;

/**
 *
 * @author LarsIvar
 */
public class VarTableFormat implements TableFormat<Variable> {

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "ID";
        } else if (column == 1) {
            return "Variable";
        } else if (column == 2) {
            return "Type";
        } else if (column == 3) {
            return "Value";
        } else if (column == 4) {
            return "Read time";
        }

        throw new IllegalStateException();
    }

    @Override
    public Object getColumnValue(Variable var, int column) {
        if (column == 0) {
            return var.getId();
        }else if (column == 1) {
            return var.getName();
        } else if (column == 2) {
            return var.getDataType();
        } else if (column == 3) {
            return var.getValue().toString();
        } else if (column == 4) {
            return var.getReadTime() + " ms";
        }

        throw new IllegalStateException();
    }
}
