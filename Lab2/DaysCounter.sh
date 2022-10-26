TODAY='date +%j'
LAB1='date -d "Sept 27" +%j'
LAB2='date -d "Oct 26" +%j'
LAB3='date -d "Nov 23" +%j'
LAB4='date -d "Dec 7" +%j'

case $DAY in
0) echo "It's today!";;
[0-9]*) echo "$DAYS days remaing.";;
-[0-9]*) echo "You missed it.";;
esac

