package sk.eset.dbsystems;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.node.Node;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.transport.Netty4Plugin;
import org.elasticsearch.node.InternalSettingsPreparer;


class LocalNode extends Node {
    LocalNode(Settings settings, Collection<Class<? extends Plugin>> classpathPlugins) {
        super(new Environment(settings, null), classpathPlugins, true);
    }
}
