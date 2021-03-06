// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.usage.dao;

import java.util.Date;
import java.util.List;

import com.cloud.usage.UsageStorageVO;
import com.cloud.utils.db.GenericDao;

public interface UsageStorageDao extends GenericDao<UsageStorageVO, Long> {
    public void removeBy(long userId, long id, int storage_type);

    public void update(UsageStorageVO usage);

    public List<UsageStorageVO> getUsageRecords(Long accountId, Long domainId, Date startDate, Date endDate, boolean limit, int page);

    List<UsageStorageVO> listById(long accountId, long id, int type);

    List<UsageStorageVO> listByIdAndZone(long accountId, long id, int type, long dcId);
}
