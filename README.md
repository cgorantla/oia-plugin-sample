# oia-plugin-sample
OIA Sample Plugin Example:


### Prerequisites


* Update OPENNMS_HOME/opennms/opennms.properties to enable trouble ticketer.

```
opennms.ticketer.plugin=org.opennms.netmgt.ticketd.OSGiBasedTicketerPlugin
opennms.alarmTroubleTicketEnabled = true
```

### Install

```
mvn install
```

### Deployment on OpenNMS

* Through features file

```
feature:repo-add mvn:org.opennms.plugins.sample/org.opennms.plugins.sample.karaf-features/1.0.0-SNAPSHOT/xml
feature:install opennms-plugins-sample-ticketer
```

* Through kar file
```
cp target/opennms-sample-plugin.kar ../../opennms/target/opennms/deploy/
```

### Create template from archetype

mvn archetype:generate -B -DarchetypeGroupId=org.opennms.integration.api -DarchetypeArtifactId=example-kar-plugin -DarchetypeVersion=0.6.0 -DgroupId=org.opennms -DartifactId=sample-ticketer -Dversion=1.0.0-SNAPSHOT -Dpackage=org.opennms.ticketer -DpluginId=sample-ticketer -DpluginName="Sample Ticketer"

