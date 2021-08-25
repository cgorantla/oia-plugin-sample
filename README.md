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


