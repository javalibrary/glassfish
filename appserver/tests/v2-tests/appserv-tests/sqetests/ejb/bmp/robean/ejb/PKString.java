/*
 * Copyright (c) 2004, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package samples.ejb.bmp.robean.ejb;

public class PKString implements java.io.Serializable {
    public String pkString = null;

    public PKString() {
    }

    public PKString(String pkString) {
        this.pkString = pkString;
    }

    public String getPK() {
        return pkString;
    }

    public int hashCode() {
        return pkString.hashCode();
    }

    public boolean equals(Object other) {
        if (other instanceof PKString) {
            return ((PKString) other).pkString.equals(pkString);
        }
        return false;
    }
}