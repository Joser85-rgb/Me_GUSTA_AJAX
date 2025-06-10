// Función para enviar el "me gusta" vía AJAX
function likePost(postId) {
  fetch(`/api/posts/${postId}/like`, {
    method: 'POST'
  })
    .then(response => response.json())
    .then(data => {
      document.getElementById(`count-${postId}`).textContent = data.likes;
    })
    .catch(error => console.error('Error:', error));
}

// Función para obtener los contadores actualizados cada 3-5 segundos
function updateLikeCounts() {
  [1, 2, 3].forEach(postId => {
    fetch(`/api/posts/${postId}/likes`)
      .then(response => response.json())
      .then(data => {
        document.getElementById(`count-${postId}`).textContent = data.likes;
      })
      .catch(error => console.error('Error al obtener likes:', error));
  });
}

// Llamada periódica cada 5 segundos
setInterval(updateLikeCounts, 5000);

// Obtener al cargar
window.onload = updateLikeCounts;
