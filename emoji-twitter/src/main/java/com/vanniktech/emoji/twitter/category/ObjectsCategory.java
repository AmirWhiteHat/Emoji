/*
 * Copyright (C) 2016 - Niklas Baudy, Ruben Gees, Mario Đanić and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.vanniktech.emoji.twitter.category;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.twitter.R;
import com.vanniktech.emoji.twitter.TwitterEmoji;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class ObjectsCategory implements EmojiCategory {
  private static final TwitterEmoji[] DATA = new TwitterEmoji[] {
    new TwitterEmoji(0x1F507, 27, 9, false),
    new TwitterEmoji(0x1F508, 27, 10, false),
    new TwitterEmoji(0x1F509, 27, 11, false),
    new TwitterEmoji(0x1F50A, 27, 12, false),
    new TwitterEmoji(0x1F4E2, 26, 25, false),
    new TwitterEmoji(0x1F4E3, 26, 26, false),
    new TwitterEmoji(0x1F4EF, 26, 38, false),
    new TwitterEmoji(0x1F514, 27, 22, false),
    new TwitterEmoji(0x1F515, 27, 23, false),
    new TwitterEmoji(0x1F3BC, 9, 22, false),
    new TwitterEmoji(0x1F3B5, 9, 15, false),
    new TwitterEmoji(0x1F3B6, 9, 16, false),
    new TwitterEmoji(new int[] { 0x1F399, 0xFE0F }, 8, 41, false),
    new TwitterEmoji(new int[] { 0x1F39A, 0xFE0F }, 8, 42, false),
    new TwitterEmoji(new int[] { 0x1F39B, 0xFE0F }, 8, 43, false),
    new TwitterEmoji(0x1F3A4, 8, 50, false),
    new TwitterEmoji(0x1F3A7, 9, 1, false),
    new TwitterEmoji(0x1F4FB, 26, 50, false),
    new TwitterEmoji(0x1F3B7, 9, 17, false),
    new TwitterEmoji(0x1F3B8, 9, 18, false),
    new TwitterEmoji(0x1F3B9, 9, 19, false),
    new TwitterEmoji(0x1F3BA, 9, 20, false),
    new TwitterEmoji(0x1F3BB, 9, 21, false),
    new TwitterEmoji(0x1F941, 41, 37, false),
    new TwitterEmoji(0x1F4F1, 26, 40, false),
    new TwitterEmoji(0x1F4F2, 26, 41, false),
    new TwitterEmoji(new int[] { 0x260E, 0xFE0F }, 47, 21, false),
    new TwitterEmoji(0x1F4DE, 26, 21, false),
    new TwitterEmoji(0x1F4DF, 26, 22, false),
    new TwitterEmoji(0x1F4E0, 26, 23, false),
    new TwitterEmoji(0x1F50B, 27, 13, false),
    new TwitterEmoji(0x1F50C, 27, 14, false),
    new TwitterEmoji(0x1F4BB, 25, 38, false),
    new TwitterEmoji(new int[] { 0x1F5A5, 0xFE0F }, 29, 51, false),
    new TwitterEmoji(new int[] { 0x1F5A8, 0xFE0F }, 30, 0, false),
    new TwitterEmoji(new int[] { 0x2328, 0xFE0F }, 46, 43, false),
    new TwitterEmoji(new int[] { 0x1F5B1, 0xFE0F }, 30, 1, false),
    new TwitterEmoji(new int[] { 0x1F5B2, 0xFE0F }, 30, 2, false),
    new TwitterEmoji(0x1F4BD, 25, 40, false),
    new TwitterEmoji(0x1F4BE, 25, 41, false),
    new TwitterEmoji(0x1F4BF, 25, 42, false),
    new TwitterEmoji(0x1F4C0, 25, 43, false),
    new TwitterEmoji(0x1F3A5, 8, 51, false),
    new TwitterEmoji(new int[] { 0x1F39E, 0xFE0F }, 8, 44, false),
    new TwitterEmoji(new int[] { 0x1F4FD, 0xFE0F }, 27, 0, false),
    new TwitterEmoji(0x1F3AC, 9, 6, false),
    new TwitterEmoji(0x1F4FA, 26, 49, false),
    new TwitterEmoji(0x1F4F7, 26, 46, false),
    new TwitterEmoji(0x1F4F8, 26, 47, false),
    new TwitterEmoji(0x1F4F9, 26, 48, false),
    new TwitterEmoji(0x1F4FC, 26, 51, false),
    new TwitterEmoji(0x1F50D, 27, 15, false),
    new TwitterEmoji(0x1F50E, 27, 16, false),
    new TwitterEmoji(0x1F52C, 27, 46, false),
    new TwitterEmoji(0x1F52D, 27, 47, false),
    new TwitterEmoji(0x1F4E1, 26, 24, false),
    new TwitterEmoji(new int[] { 0x1F56F, 0xFE0F }, 28, 42, false),
    new TwitterEmoji(0x1F4A1, 25, 7, false),
    new TwitterEmoji(0x1F526, 27, 40, false),
    new TwitterEmoji(0x1F3EE, 12, 11, false),
    new TwitterEmoji(0x1F4D4, 26, 11, false),
    new TwitterEmoji(0x1F4D5, 26, 12, false),
    new TwitterEmoji(0x1F4D6, 26, 13, false),
    new TwitterEmoji(0x1F4D7, 26, 14, false),
    new TwitterEmoji(0x1F4D8, 26, 15, false),
    new TwitterEmoji(0x1F4D9, 26, 16, false),
    new TwitterEmoji(0x1F4DA, 26, 17, false),
    new TwitterEmoji(0x1F4D3, 26, 10, false),
    new TwitterEmoji(0x1F4D2, 26, 9, false),
    new TwitterEmoji(0x1F4C3, 25, 46, false),
    new TwitterEmoji(0x1F4DC, 26, 19, false),
    new TwitterEmoji(0x1F4C4, 25, 47, false),
    new TwitterEmoji(0x1F4F0, 26, 39, false),
    new TwitterEmoji(new int[] { 0x1F5DE, 0xFE0F }, 30, 12, false),
    new TwitterEmoji(0x1F4D1, 26, 8, false),
    new TwitterEmoji(0x1F516, 27, 24, false),
    new TwitterEmoji(new int[] { 0x1F3F7, 0xFE0F }, 12, 21, false),
    new TwitterEmoji(0x1F4B0, 25, 27, false),
    new TwitterEmoji(0x1F4B4, 25, 31, false),
    new TwitterEmoji(0x1F4B5, 25, 32, false),
    new TwitterEmoji(0x1F4B6, 25, 33, false),
    new TwitterEmoji(0x1F4B7, 25, 34, false),
    new TwitterEmoji(0x1F4B8, 25, 35, false),
    new TwitterEmoji(0x1F4B3, 25, 30, false),
    new TwitterEmoji(0x1F4B9, 25, 36, false),
    new TwitterEmoji(0x1F4B1, 25, 28, false),
    new TwitterEmoji(0x1F4B2, 25, 29, false),
    new TwitterEmoji(new int[] { 0x2709, 0xFE0F }, 49, 17, false),
    new TwitterEmoji(0x1F4E7, 26, 30, false),
    new TwitterEmoji(0x1F4E8, 26, 31, false),
    new TwitterEmoji(0x1F4E9, 26, 32, false),
    new TwitterEmoji(0x1F4E4, 26, 27, false),
    new TwitterEmoji(0x1F4E5, 26, 28, false),
    new TwitterEmoji(0x1F4E6, 26, 29, false),
    new TwitterEmoji(0x1F4EB, 26, 34, false),
    new TwitterEmoji(0x1F4EA, 26, 33, false),
    new TwitterEmoji(0x1F4EC, 26, 35, false),
    new TwitterEmoji(0x1F4ED, 26, 36, false),
    new TwitterEmoji(0x1F4EE, 26, 37, false),
    new TwitterEmoji(new int[] { 0x1F5F3, 0xFE0F }, 30, 17, false),
    new TwitterEmoji(new int[] { 0x270F, 0xFE0F }, 49, 42, false),
    new TwitterEmoji(new int[] { 0x2712, 0xFE0F }, 49, 43, false),
    new TwitterEmoji(new int[] { 0x1F58B, 0xFE0F }, 29, 29, false),
    new TwitterEmoji(new int[] { 0x1F58A, 0xFE0F }, 29, 28, false),
    new TwitterEmoji(new int[] { 0x1F58C, 0xFE0F }, 29, 30, false),
    new TwitterEmoji(new int[] { 0x1F58D, 0xFE0F }, 29, 31, false),
    new TwitterEmoji(0x1F4DD, 26, 20, false),
    new TwitterEmoji(0x1F4BC, 25, 39, false),
    new TwitterEmoji(0x1F4C1, 25, 44, false),
    new TwitterEmoji(0x1F4C2, 25, 45, false),
    new TwitterEmoji(new int[] { 0x1F5C2, 0xFE0F }, 30, 4, false),
    new TwitterEmoji(0x1F4C5, 25, 48, false),
    new TwitterEmoji(0x1F4C6, 25, 49, false),
    new TwitterEmoji(new int[] { 0x1F5D2, 0xFE0F }, 30, 8, false),
    new TwitterEmoji(new int[] { 0x1F5D3, 0xFE0F }, 30, 9, false),
    new TwitterEmoji(0x1F4C7, 25, 50, false),
    new TwitterEmoji(0x1F4C8, 25, 51, false),
    new TwitterEmoji(0x1F4C9, 26, 0, false),
    new TwitterEmoji(0x1F4CA, 26, 1, false),
    new TwitterEmoji(0x1F4CB, 26, 2, false),
    new TwitterEmoji(0x1F4CC, 26, 3, false),
    new TwitterEmoji(0x1F4CD, 26, 4, false),
    new TwitterEmoji(0x1F4CE, 26, 5, false),
    new TwitterEmoji(new int[] { 0x1F587, 0xFE0F }, 29, 27, false),
    new TwitterEmoji(0x1F4CF, 26, 6, false),
    new TwitterEmoji(0x1F4D0, 26, 7, false),
    new TwitterEmoji(new int[] { 0x2702, 0xFE0F }, 49, 14, false),
    new TwitterEmoji(new int[] { 0x1F5C3, 0xFE0F }, 30, 5, false),
    new TwitterEmoji(new int[] { 0x1F5C4, 0xFE0F }, 30, 6, false),
    new TwitterEmoji(new int[] { 0x1F5D1, 0xFE0F }, 30, 7, false),
    new TwitterEmoji(0x1F512, 27, 20, false),
    new TwitterEmoji(0x1F513, 27, 21, false),
    new TwitterEmoji(0x1F50F, 27, 17, false),
    new TwitterEmoji(0x1F510, 27, 18, false),
    new TwitterEmoji(0x1F511, 27, 19, false),
    new TwitterEmoji(new int[] { 0x1F5DD, 0xFE0F }, 30, 11, false),
    new TwitterEmoji(0x1F528, 27, 42, false),
    new TwitterEmoji(new int[] { 0x26CF, 0xFE0F }, 48, 32, false),
    new TwitterEmoji(new int[] { 0x2692, 0xFE0F }, 48, 11, false),
    new TwitterEmoji(new int[] { 0x1F6E0, 0xFE0F }, 37, 8, false),
    new TwitterEmoji(new int[] { 0x1F5E1, 0xFE0F }, 30, 13, false),
    new TwitterEmoji(new int[] { 0x2694, 0xFE0F }, 48, 13, false),
    new TwitterEmoji(0x1F52B, 27, 45, false),
    new TwitterEmoji(0x1F3F9, 12, 23, false),
    new TwitterEmoji(new int[] { 0x1F6E1, 0xFE0F }, 37, 9, false),
    new TwitterEmoji(0x1F527, 27, 41, false),
    new TwitterEmoji(0x1F529, 27, 43, false),
    new TwitterEmoji(new int[] { 0x2699, 0xFE0F }, 48, 17, false),
    new TwitterEmoji(new int[] { 0x1F5DC, 0xFE0F }, 30, 10, false),
    new TwitterEmoji(new int[] { 0x2697, 0xFE0F }, 48, 16, false),
    new TwitterEmoji(new int[] { 0x2696, 0xFE0F }, 48, 15, false),
    new TwitterEmoji(0x1F517, 27, 25, false),
    new TwitterEmoji(new int[] { 0x26D3, 0xFE0F }, 48, 34, false),
    new TwitterEmoji(0x1F489, 24, 35, false),
    new TwitterEmoji(0x1F48A, 24, 36, false),
    new TwitterEmoji(0x1F6AC, 35, 17, false),
    new TwitterEmoji(new int[] { 0x26B0, 0xFE0F }, 48, 24, false),
    new TwitterEmoji(new int[] { 0x26B1, 0xFE0F }, 48, 25, false),
    new TwitterEmoji(0x1F5FF, 30, 23, false),
    new TwitterEmoji(new int[] { 0x1F6E2, 0xFE0F }, 37, 10, false),
    new TwitterEmoji(0x1F52E, 27, 48, false),
    new TwitterEmoji(0x1F6D2, 37, 7, false)
  };

  @Override @NonNull public TwitterEmoji[] getEmojis() {
    return DATA;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_twitter_category_objects;
  }

  @Override @StringRes public int getCategoryName() {
    return R.string.emoji_twitter_category_objects;
  }
}
