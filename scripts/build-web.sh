#!/usr/bin/env bash
set -euo pipefail

ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
BUILD="$ROOT/build"
SITE="$ROOT/site"

rm -rf "$BUILD" "$SITE"
mkdir -p "$BUILD/classes" "$SITE"

javac --release 8 -d "$BUILD/classes" "$ROOT"/src/*.java
jar cfe "$SITE/StrataSnake.jar" StrataSnake -C "$BUILD/classes" .
cp "$ROOT/web/index.html" "$SITE/index.html"
touch "$SITE/.nojekyll"

echo "Built $SITE/StrataSnake.jar and $SITE/index.html"
