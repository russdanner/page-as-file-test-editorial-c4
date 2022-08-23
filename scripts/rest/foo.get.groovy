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

    Feed feed = new Feed();
    feed.setFeedType("atom_1.0");
    feed.setTitle("HowToDoInJava");
    feed.setId("https://howtodoinjava.com");
 
    Content subtitle = new Content();
    subtitle.setType("text/plain");
    subtitle.setValue("Different Articles on latest technology");
    feed.setSubtitle(subtitle);
 
    Date postDate = new Date();
    feed.setUpdated(postDate);
 
    Entry entry = new Entry();
 
    Link link = new Link();
    link.setHref("https://howtodoinjava.com/spring5/webmvc/spring-mvc-cors-configuration/");
    entry.setAlternateLinks(Collections.singletonList(link));
    SyndPerson author = new Person();
    author.setName("Lokesh Gupta");
    entry.setAuthors(Collections.singletonList(author));
    entry.setCreated(postDate);
    entry.setPublished(postDate);
    entry.setUpdated(postDate);
    entry.setId("https://howtodoinjava.com/spring5/webmvc/spring-mvc-cors-configuration/");
    entry.setTitle("spring-mvc-cors-configuration");
 
    Category category = new Category();
    category.setTerm("CORS");
    entry.setCategories(Collections.singletonList(category));
 
    Content summary = new Content();
    summary.setType("text/plain");
    summary.setValue(
        "CORS helps in serving web content from multiple domains into browsers who usually have the same-origin security policy. In this example, we will learn to enable CORS support in Spring MVC application at method and global level."
            + "The post <a rel=\"nofollow\" href=\"https://howtodoinjava.com/spring5/webmvc/spring-mvc-cors-configuration/\">Spring CORS Configuration Examples</a> appeared first on <a rel=\"nofollow\" href=\"https://howtodoinjava.com\">HowToDoInJava</a>.");
    entry.setSummary(summary);
 
    feed.setEntries(Collections.singletonList(entry));
    //Like more Entries here about different new topics
    
    
    
    return feed;