# COMP1010-Assignment

# Music Library Management Project Overview

## Project Specifications and Sample Output

---

## Project Overview

The **Music Library Management** application is a Java-based program that allows users to manage their music playlists effectively. The application supports four distinct playlists: one for solo artist songs, one for band songs, another for songs by a specific artist, and a final playlist for songs by various artists. Users can play, pause, shuffle, and navigate through the playlists, enhancing their listening experience.

---

## Functional Requirements

### 1. Playlist Management

- **Playlist Creation:**
  - Users can create and manage up to **four playlists**.
  - Each playlist can contain multiple songs.

### 2. Playlist Types

- **Types of Playlists:**
  - **Solo Artist Playlist:** Contains songs from solo artists.
  - **Band Playlist:** Contains songs from bands.
  - **Artist Playlist:** Contains songs by a specific artist.
  - **Various Artists Playlist:** Contains songs from various artists.

### 3. Music Playback Controls

- **Playback Features:**
  - **Play:** Start playing the selected song from the playlist.
  - **Pause:** Pause the current song.
  - **Next:** Skip to the next song in the playlist.
  - **Shuffle:** Randomly rearrange the song order in the playlist.
  - **Previous:** Go back to the last song.

### 4. User Interaction

- **Song Selection:**
  - Users can select a specific playlist to play.
  - Users can choose a song to play by its number in the playlist.
  - Users can pause the song, go to next song, shuffle the playlist.

### 5. Output

- **Output Format:**
  - The application generates a **summary output** of the playlist being played, including:
    - **Playlist Name**
    - **Currently Playing Song**
    - **Playback Status** (Playing, Paused)
    - **Total Songs in Playlist**

---

## Non-Functional Requirements

### 1. Performance and Scalability

- **Efficient Playback:**
  - The application should handle multiple playlists and song navigation with minimal latency.

### 2. Documentation and Usability

- **User Guide:**
  - Comprehensive documentation on how to use the application features and playback controls.

---

## Technical Specifications

### 1. Programming Language and Environment

- **Language:**
  - Developed using **Java SE 11 or higher**.

### 2. Data Structures

- **Playlist Representation:**
  - Each playlist is represented as an **object** containing a list of songs.
  - Each song is an object with attributes such as title, artist, and duration.

### 3. Algorithms and Logic

- **Playback Logic:**
  - Implement control functions for play, pause, next, and shuffle operations.
  - Maintain the current state of the playlist (e.g., currently playing song).

### 4. Testing and Quality Assurance

- **Unit Testing:**
  - Test individual playback controls and playlist functionalities.

---

## Sample Output

### Sample Playlist Structure:

1. **Solo Artist Playlist:**
   - **Songs:**
     - "Blinding Lights" by The Weeknd
     - "Say" by Keshi
2. **Band Playlist:**
   - **Songs:**
     - "18" by One Direction
     - "You & I" by Oasis
3. **Artist Playlist:**
   - **Songs:**
     - "After Hours" by The Weeknd
     - "Die for You" by The Weeknd
4. **Various Artists Playlist:**
   - **Songs:**
     - "Daylight" by Taylor Swift
     - "Double Take" by Dhruv

### Sample Playback Output:


---

## Conclusion

The **Music Library Management** application effectively combines functionality and user experience, allowing users to engage with their music in a structured yet enjoyable way. With four distinct playlists tailored to various music genres and artists, the application enhances the listening experience through essential playback controls. By enabling features such as play, pause, next, and shuffle, users can effortlessly navigate their music collection. Additionally, the static nature of the playlists ensures a consistent and reliable experience, allowing users to focus on enjoying their favorite tracks without the distraction of modifications. Overall, this project not only serves as a practical application of Java programming concepts but also provides an engaging platform for music enthusiasts to explore and enjoy their playlists.


