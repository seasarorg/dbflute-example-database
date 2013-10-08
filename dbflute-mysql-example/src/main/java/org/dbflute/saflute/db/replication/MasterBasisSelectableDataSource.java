/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.saflute.db.replication;

import javax.sql.DataSource;

import org.seasar.extension.datasource.impl.SelectableDataSourceProxy;

/**
 * @author jflute
 */
public class MasterBasisSelectableDataSource extends SelectableDataSourceProxy {

    /**
     * Get the real data-source selected. <br />
     * This overrides to return data-source for MasterDB as default. 
     * @return The instance of real data-source. (NotNull)
     */
    @Override
    public DataSource getDataSource() {
        String dataSourceName = dataSourceFactory.getSelectableDataSourceName();
        if (dataSourceName == null) { // means no name set on thread local
            dataSourceName = SlaveDBAccessor.MASTER_DB; // as default
        }
        return dataSourceFactory.getDataSource(dataSourceName);
    }
}
