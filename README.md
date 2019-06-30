# test
Using Java language implement a method getLikes which must take in input array, containing the names of people who like an item. The method must return the text as shown in the examples:
• getLikes [] // must be "no likes for this post"
• getLikes ["Peter"] // must be "Peter likes this post"
• getLikes ["Jacob", "Alex"] // must be "Jacob and Alex like this post"
• getLikes ["Max", "John", "Mark"] // must be "Max, John and Mark like this post"
• getLikes ["Alex", "Jacob", "Mark", "Max"] // must be "Alex, Jacob and 2 others like this post"
• For 4 or more names, the number in and 2 others simply increases.
• getLikes ["Jacob", "Jacob"] // must be "Jacob like this post" - if duplicate just ignore it
