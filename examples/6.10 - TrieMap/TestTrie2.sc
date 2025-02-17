import $file.Trie, Trie._

val t = new Trie[Int]()
t.add("mango", 1337); t.add("mandarin", 31337); t.add("map", 37); t.add("man", 7)
assert(t.get("mango") == Some(1337))
assert(t.prefixesMatchingString("mangosteen") == Map("man" -> 7, "mango" -> 1337))
assert(t.stringsMatchingPrefix("mand") == Map("mandarin" -> 31337))
