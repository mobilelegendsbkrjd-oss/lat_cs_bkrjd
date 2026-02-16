package com.pandrama;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Pandrama.kt */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.pandrama.Pandrama", f = "Pandrama.kt", i = {0, 0, 0}, l = {31}, m = "getMainPage", n = {"request", "url", "page"}, nl = {33}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: C:\Users\Usuario\Documents\GitHub\lat_cs_bkrjd\builds\classes.dex */
public final class Pandrama$getMainPage$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pandrama this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pandrama$getMainPage$1(Pandrama pandrama, Continuation<? super Pandrama$getMainPage$1> continuation) {
        super(continuation);
        this.this$0 = pandrama;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getMainPage(0, null, (Continuation) this);
    }
}