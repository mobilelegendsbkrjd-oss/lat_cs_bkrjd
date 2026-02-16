package com.pandrama;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Pandrama.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.pandrama.Pandrama", f = "Pandrama.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {68, 86, 91}, m = "load", n = {"url", "url", "doc", "title", "poster", "plot", "episodes", "url", "doc", "title", "poster", "plot", "episodes"}, nl = {70, 91, 85}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: C:\Users\Usuario\Documents\GitHub\lat_cs_bkrjd\builds\classes.dex */
public final class Pandrama$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pandrama this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pandrama$load$1(Pandrama pandrama, Continuation<? super Pandrama$load$1> continuation) {
        super(continuation);
        this.this$0 = pandrama;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, (Continuation) this);
    }
}