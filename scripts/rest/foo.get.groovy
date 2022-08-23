@Grab(group='rome', module='rome', version='1.0')

import com.rometools.rome.io.SyndFeedOutput;
import com.rometools.rome.feed.synd.SyndFeedImpl
import com.rometools.rome.feed.synd.SyndFeed

SyndFeed feed = new SyndFeedImpl();
feed.setFeedType("rss_1.0");
feed.setTitle("Test title");
feed.setLink("http://www.somelink.com");
feed.setDescription("Basic description");

    
    
    SyndFeedOutput output = new SyndFeedOutput();
  return output.outputString(feed, true);
    