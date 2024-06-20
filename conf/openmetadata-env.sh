#!/bin/bash
#  Copyright 2021 Collate
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#  http://www.apache.org/licenses/LICENSE-2.0
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

export DB_HOST=192.168.210.10
export DB_USER=root
export DB_USER_PASSWORD=longshine@2023
export OM_DATABASE=openmetadata
export ELASTICSEARCH_HOST=192.168.210.10
export PIPELINE_SERVICE_CLIENT_ENDPOINT=
export SERVER_HOST_API_URL=http://localhost:8585/api
export PIPELINE_SERVICE_CLIENT_ENABLED=false
export AUTHORIZER_CLASS_NAME=org.openmetadata.service.security.NoopAuthorizer
export PIPELINE_SERVICE_CLIENT_CLASS_NAME=org.openmetadata.service.clients.pipeline.noop.NoopClient
export NACOS_SERVER_ADDR=192.168.210.10:8848
export NACOS_NAMESPACE=public
