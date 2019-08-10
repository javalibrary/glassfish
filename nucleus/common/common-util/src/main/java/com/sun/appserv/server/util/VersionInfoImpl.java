/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.appserv.server.util;

import javax.inject.Singleton;

import org.glassfish.api.VersionInfo;
import org.jvnet.hk2.annotations.Service;

@Service
@Singleton
public class VersionInfoImpl implements VersionInfo {

    @Override
    public String getAbbreviatedProductName() {
        return Version.getAbbrevProductName();
    }

    @Override
    public String getVersionPrefix() {
        return Version.getVersionPrefix();
    }

    @Override
    public String getMajorVersion() {
        return Version.getMajorVersion();
    }

    @Override
    public String getMinorVersion() {
        return Version.getMinorVersion();
    }

}