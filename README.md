# Introduction

OpenMetadata is an open standard with a centralized metadata store and ingestion framework supporting [connectors](integrations/connectors/) for a wide range of services. The metadata ingestion framework enables you to customize or add support for any service. REST APIs enable you to integrate OpenMetadata with existing tool chains. Using the OpenMetadata user interface (UI), data consumers can discover the right data to use in decision making and data producers can assess usage and consumer experience in order to plan improvements and prioritize bug fixes.

OpenMetadata enables metadata management end-to-end, giving you the ability to unlock the value of data assets in the common use cases of data discovery and governance, but also in emerging use cases related to data quality, observability, and people collaboration.

{% embed url="https://youtu.be/pF8L_mAtexo" %}

## Connectors

OpenMetadata provides connectors that enable you to perform metadata ingestion from a number of common database, dashboard, messaging, and pipeline services. With each release, we add additional connectors and the ingestion framework provides a structured and straightforward method for creating your own connectors. See the table below for a list of supported connectors.

| A-E                                                       | F-0                                                                  | P-Z                                                   |
| --------------------------------------------------------- | -------------------------------------------------------------------- | ----------------------------------------------------- |
| Airbyte                                                   | Glue                                                                 | [Postgres](integrations/connectors/postgres/)         |
| [Airflow](integrations/airflow/)                          | [Glue Catalog](integrations/connectors/glue-catalog/)                | Power BI                                              |
| [Amazon S3 Data Lake](integrations/connectors/data-lake/) | [Google Cloud Service Data Lake](integrations/connectors/data-lake/) | [Presto](integrations/connectors/presto/)             |
| [Amundsen](integrations/connectors/amundsen.md)           | [Hive](integrations/connectors/hive/)                                | Pulsar (WIP)                                          |
| Apache Atlas                                              | [IBM Db2](integrations/connectors/ibm-db2.md)                        | [Redash](integrations/connectors/redash/)             |
| Apache Druid                                              | [Kafka](integrations/connectors/kafka.md)                            | [Redshift](integrations/connectors/redshift/)         |
| Apache Iceberg                                            | LDAP                                                                 | [Redshift Usage](integrations/connectors/redshift/)   |
| Apache Pinot                                              | [Looker](integrations/connectors/looker/)                            | [Salesforce](integrations/connectors/salesforce/)     |
| [Athena](integrations/connectors/athena/)                 | [MariaDB](integrations/connectors/mariadb.md)                        | [SingleStore](integrations/connectors/singlestore/)   |
| [Azure SQL](integrations/connectors/azure-sql/)           | [Metabase](integrations/connectors/metabase/)                        | [Snowflake](integrations/connectors/snowflake/)       |
| [BigQuery](integrations/connectors/bigquery/)             | [MLflow](integrations/connectors/mlflow/)                            | [Snowflake Usage](integrations/connectors/snowflake/) |
| [BigQuery Usage](integrations/connectors/bigquery/)       | [Mode Analytics](integrations/connectors/mode/)                      | SQLAlchemy                                            |
| [ClickHouse](integrations/connectors/clickhouse/)         | [MSSQL](integrations/connectors/mssql/)                              | [Superset](integrations/connectors/superset-1/)       |
| [ClickHouse Usage](integrations/connectors/clickhouse/)   | [MSSQL Usage](integrations/connectors/mssql/)                        | [Tableau](integrations/connectors/tableau/)           |
| [Databricks](integrations/connectors/databricks/)         | ​​[MySQL](integrations/connectors/mysql/)                            | [Trino](integrations/connectors/trino/)               |
| [DBT](data-lineage/dbt-integration/)                      | [Oracle](integrations/connectors/oracle/)                            | [Vertica](integrations/connectors/vertica/)           |
| [Delta Lake](integrations/connectors/delta-lake/)         |                                                                      |                                                       |
| [DynamoDB](integrations/connectors/dynamodb/)             |                                                                      |                                                       |

## OpenMetadata Components

The key components of OpenMetadata include the following:

* **OpenMetadata User Interface (UI)** - a central place for users to discover and collaborate on all data. See [Features](overview/features.md) for an overview of the OpenMetadata UI.
* **Ingestion framework** - a pluggable framework for integrating tools and ingesting metadata to the metadata store. The ingestion framework already supports well-known data warehouses. See the [Connectors](./#connectors) section for a complete list and documentation on supported services.
* **Metadata APIs** - for producing and consuming metadata built on schemas for User Interfaces and for Integrating tools, systems, and services. See the API [Overview](metadata-standard/apis/overview.md) for details.
* **Metadata store** - stores a metadata graph that connects data assets and user and tool generated metadata.
* **Metadata schemas** - defines core abstractions and vocabulary for metadata with schemas for Types, Entities, and Relationships between entities. This is the foundation of the Open Metadata Standard. See the [Schema Concepts](metadata-standard/schemas/overview.md) section to learn more about metadata schemas.

![](<.gitbook/assets/openmetadata-overview (1).png>)

## License

OpenMetadata is released under [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)
