package io.github.ekardnam.sertraline.test.builder;

import io.github.ekardnam.sertraline.builder.DefaultLayerBuilder;
import io.github.ekardnam.sertraline.builder.FeedForwardLinker;
import io.github.ekardnam.sertraline.objects.Layer;
import io.github.ekardnam.sertraline.objects.Neuron;
import org.junit.Assert;
import org.junit.Test;

public class FeedForwardLinkerTest {

    @Test
    public void testFeedForwardLinker() {
        int n1 = 5;
        int n2 = 6;
        DefaultLayerBuilder dlb = new DefaultLayerBuilder();
        Layer l1 = dlb.build(n1);
        Layer l2 = dlb.build(n2);
        FeedForwardLinker ffl = new FeedForwardLinker();
        ffl.link(l1, l2);
        Assert.assertTrue("Layers aren't linked correctly", FeedForwardLinker.areLinkedFeedForwardly(l1, l2));
    }

}