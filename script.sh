

#!  bin/bash

# this is example on case in shell scripting

echo -e "Enter the Character: \c"
read char
case $char in
  [a-z] ) 
     echo "1111"
     ;;
  [A_Z] )
     echo "22222"
     ;;
   [0-9] )
      echo "33333"
    
esac


      
  
