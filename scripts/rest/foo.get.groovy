@Grab(group='rome', module='rome', version='1.0')

import com.rometools.rome.feed.atom.Category;
import com.rometools.rome.feed.atom.Content;
import com.rometools.rome.feed.atom.Entry;
import com.rometools.rome.feed.atom.Feed;
import com.rometools.rome.feed.atom.Link;
import com.rometools.rome.feed.atom.Person;
import com.rometools.rome.feed.rss.Channel;
import com.rometools.rome.feed.rss.Description;
import com.rometools.rome.feed.rss.Image;
import com.rometools.rome.feed.rss.Item;
import com.rometools.rome.feed.synd.SyndPerson;
import com.rometools.rome.io.SyndFeedOutput;
import com.rometools.rome.feed.synd.SyndFeedImpl

SyndFeed feed = new SyndFeedImpl();
feed.setFeedType("rss_1.0");
feed.setTitle("Test title");
feed.setLink("http://www.somelink.com");
feed.setDescription("Basic description");

    
    
    SyndFeedOutput output = new SyndFeedOutput();
  return output.outputString(feed, true);
    