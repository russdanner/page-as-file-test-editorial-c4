@Grab(group='rome', module='rome', version='1.0')

import com.rometools.rome.io.SyndFeedOutput;
import com.rometools.rome.feed.synd.*

SyndFeed feed = new SyndFeedImpl();
feed.setFeedType("rss_1.0");
feed.setTitle("Test title");
feed.setLink("http://www.somelink.com");
feed.setDescription("Basic description");

SyndEntry entry = new SyndEntryImpl();
entry.setTitle("Entry title");        
entry.setLink("http://www.somelink.com/entry1");

SyndContent description = new SyndContentImpl();
description.setType("text/html");
description.setValue("First entry");
entry.setDescription(description);
    
feed.setEntries(Arrays.asList(entry));

SyndFeedOutput output = new SyndFeedOutput();
def feedResponse = output.outputString(feed, true);

response.setContentType("text/rss+xml")
response.getOutputStream().write(feedResponse)    