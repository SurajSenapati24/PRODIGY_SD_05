package com.scrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScraper {

    public static void main(String[] args) {
        // URL of the Books to Scrape site
        String url = "http://books.toscrape.com/";

        // List to hold book data
        List<String[]> bookData = new ArrayList<>();

        try {
            // Fetch the HTML content
            Document doc = Jsoup.connect(url).get();

            // Extract book information
            Elements books = doc.select(".product_pod");
            for (Element book : books) {
                String title = book.select("h3 a").attr("title");
                String price = book.select(".price_color").text();
                String rating = book.select(".star-rating").attr("class").replace("star-rating ", "");

                // Add book data to the list
                bookData.add(new String[]{title, price, rating});
            }

            // Write data to CSV file
            try (CSVWriter writer = new CSVWriter(new FileWriter("books.csv"))) {
                // Write header
                writer.writeNext(new String[]{"Title", "Price", "Rating"});

                // Write book data
                writer.writeAll(bookData);
            }

            System.out.println("Data saved to books.csv");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
