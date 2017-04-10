package org.collectd.coalesce;

import org.collectd.api.Collectd;
import org.collectd.api.CollectdTargetFactoryInterface;
import org.collectd.api.CollectdTargetInterface;
import org.collectd.api.DataSet;
import org.collectd.api.OConfigItem;
import org.collectd.api.ValueList;

/**
 * Created by bvarner on 4/6/17.
 */
public class Coalesce implements CollectdTargetFactoryInterface, CollectdTargetInterface {

    public Coalesce() {
        Collectd.registerTarget("coalesce", this);
        Collectd.logInfo("Registered target: coalesce");
    }

    @Override
    public CollectdTargetInterface createTarget(OConfigItem ci) {
        Collectd.logInfo("createTarget: " + ci);
        return this;
    }


    @Override
    public int invoke(DataSet ds, ValueList vl) {
        Collectd.logInfo("Target invoked with: " + ds + " and " + vl);
        return Collectd.FC_TARGET_CONTINUE;
    }
}
