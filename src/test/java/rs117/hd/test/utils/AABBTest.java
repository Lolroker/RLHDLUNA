package rs117.hd.test.utils;

import org.junit.Assert;
import org.junit.Test;
import rs117.hd.utils.AABB;

public class AABBTest {
	@Test
	public void testRegionBox() {
		Assert.assertEquals(new AABB(3264, 5120, 3327, 5759), AABB.regionBox(13136, 13145));
	}

	@Test
	public void testRegion() {
		Assert.assertEquals(new AABB(3264, 5696, 3327, 5759), new AABB(13145));
	}
}