#!/bin/bash
TEXT="We'll use Ubuntu as reference distribution. The steps might lightly differ from one distribution to another."
KEY=$(cat ./key)
cp "$(java StringToMp3.java "$KEY" "$TEXT")" ./