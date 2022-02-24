package day50_Collections_Map;

import OfficeHours.day09.mobileAppTask.MobileApp;

public class MapIntro {

    /*
    MAP
    - collection of pairs
    - data structure based on the key + value pairs
    - does not have is a relation with Collection
    - size can be increased or decreased
    - key cannot be duplicated
      - when keys are duplicated hashMap accepts the last inserted duplicated pair, and the others are removed.
    - value can be duplicated
    - import java.util.Map;

    ID(Key)         Name(Value)
    12              George
    24              Martin
    45              Milvia
    56              Sanja

   MAP HIERARCHY
   1. HASH MAP CLASS implements Map interface
      1.1. LINKED HASH MAP CLASS extends HashMap Class
   2. HASHTABLE CLASS implements Map
   3. SORTED MAP INTERFACE extends Map
      3.1. TREE MAP CLASS implements SortedMap Interface

   HASH MAP CLASS
   - implements the Map interface
   - maintains the random order
   - accepts null as a key and value
   - not synchronized
   - import java.util.HashMap;

   LINKED HASH MAP CLASS
   - child class of HashMap
   - maintains the insertion order
   - accepts null value as a key
   - not synchronized
   - import java.util.LinkedHashMap;

   TREE MAP CLASS
   - implements the SortedMap interface
   - maintains the sorted, ascending, order
   - does not accept null as a key (NullPointException), but value can be null
   - not synchronized
   - import java.util.TreeMap;

   HASHTABLE CLASS
   - implements the Map interface
   - maintains the random order
   - does not accept null as a key or value
   - synchronized (thread safe)
   - import.java.util.Hashtable;

   HashMap       LinkedHashMap   Hashtable      TreeMap

       not          not                            not
   synchronized  synchronized    synchronized   synchronized

   one null key  one null key     no null key    no null key
   null values   null values      no null value  null values

   random order   insertion order  random order  sorted order


    METHODS OF THE MAP
    put(key, value) - inserts the given key and value to map
    get(key) - returns the value of the given key
    getKey()
    containsKey(key) - returns true if the given key is contained in the map. Otherwise, returns false.
    getValue()
    containsValue(value) - returns true if the given value is contains in the map. Otherwise, returns false.
    size()
    replace(key, newValue) - replaces the value of the given key with the given new value
    remove(key) - removes the given key and its value from the map
    isEmpty() - returns true if the size of the map is 0. Otherwise, returns false.
    equals(Map) - returns true if the given Map is equal with the current map. Otherwise, returns false.
    clear() - removes all the pairs from the map.
    keySet() - returns all the keys of the map. returnType is Set.
    values() - returns all the values of the map. returnType is Collection
    entrySet() - returns all the entries (Entry: key and value) of Map

     */
}
