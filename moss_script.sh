#!/bin/bash

# Replace with your actual MOSS user ID
MOSS_USER_ID="your_moss_user_id"

# Path to the MOSS script (you need to download this separately)
MOSS_SCRIPT="./moss"

# Run MOSS on all Java files in the src directory
$MOSS_SCRIPT -l java -d ./src/main/java/*.java

echo "MOSS analysis complete. Check the URL in the output above for results."