package com.pandrama;

import com.lagradost.cloudstream3.plugins.BasePlugin;
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin;
import kotlin.Metadata;

/* compiled from: PandramaPlugin.kt */
@CloudstreamPlugin
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/pandrama/PandramaPlugin;", "Lcom/lagradost/cloudstream3/plugins/BasePlugin;", "<init>", "()V", "load", "", "pandrama_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: C:\Users\Usuario\Documents\GitHub\lat_cs_bkrjd\builds\classes.dex */
public final class PandramaPlugin extends BasePlugin {
    public void load() {
        registerMainAPI(new Pandrama());
    }
}