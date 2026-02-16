package com.pandrama;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Pandrama.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.pandrama.Pandrama", f = "Pandrama.kt", i = {0, 0}, l = {51}, m = "search", n = {"query", "url"}, nl = {53}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: C:\Users\Usuario\Documents\GitHub\lat_cs_bkrjd\builds\classes.dex */
public final class Pandrama$search$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pandrama this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pandrama$search$1(Pandrama pandrama, Continuation<? super Pandrama$search$1> continuation) {
        super(continuation);
        this.this$0 = pandrama;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.search(null, (Continuation) this);
    }
}