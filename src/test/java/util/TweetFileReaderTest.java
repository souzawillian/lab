package util;

import org.junit.Assert;
import org.junit.Test;
import pojo.Tweet;

import java.io.File;
import java.util.List;

/**
 * Created by robinho on 18/04/17.
 */
public class TweetFileReaderTest {

    @Test
    public void testReadTweetsFromFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File resourceFile = new File(classLoader.getResource("test/DatasetTweets.txt").getFile());

        List<Tweet> tweets = TweetFileReader.readTweetsFromFile(resourceFile);
        Assert.assertEquals(3, tweets.size());
    }
}
