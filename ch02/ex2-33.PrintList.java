// collections/fpij/PrintList.java

for(int i = 0; i < friends.size() -1; i++) {
  System.out.print(friends.get(i) + ", ");
}

if(friends.size() > 0)
  System.out.println(friends.get(friends.size() - 1));
