package sk.eset.dbsystems;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.node.Node;
import java.io.IOException;
import java.util.Arrays;

import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.transport.Netty4Plugin;
import org.elasticsearch.node.InternalSettingsPreparer;


class LocalNode extends Node {
    LocalNode(Settings settings) {
        super(new Environment(settings, null), Arrays.asList(Netty4Plugin.class), true);
    }
}
